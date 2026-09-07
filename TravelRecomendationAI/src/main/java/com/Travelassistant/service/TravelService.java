package com.Travelassistant.service;

import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

import com.Travelassistant.dto.TravelRequest;

@Service
public class TravelService {

    private final ChatClient chatClient;

    public TravelService(ChatClient.Builder builder) {
        this.chatClient = builder.build();
    }

    public String getTravelPlan(TravelRequest request) {

        String prompt = """
                You are an expert travel planner.

                Recommend a travel destination based on:

                Place Preferences: %s
                Budget: %.2f INR
                Number of days: %d
                Travel month: %s
                Number of Travellers: %d
                Departure City: %s

                Consider:
                - Weather conditions
                - Seasonal suitability
                - Budget constraints
                - Travel duration

                Provide:

                1. Best Destination
                2. Why this destination is suitable
                3. Day-wise itinerary
                4. Estimated cost breakdown in INR
                5. Top attractions
                6. Food recommendations
                7. Travel tips
                8. Alternative destination options
                9. Private cab or bus starting information that fits within the budget
                10. Hotel stay options within the budget

                Return the response in a structured and easy-to-read format.
                """.formatted(
                        request.getPlaceType(),
                        request.getBudget(),
                        request.getDays(),
                        request.getTravelMonth(),
                        request.getTravellers(),
                        request.getDepartureCity()
                );

        return chatClient
                .prompt()
                .user(prompt)
                .call()
                .content();
    }
}