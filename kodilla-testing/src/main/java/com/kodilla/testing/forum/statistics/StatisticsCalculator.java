package com.kodilla.testing.forum.statistics;

import java.util.List;

public class StatisticsCalculator {
    private List<String> userNames;
    private int postsCount;
    private int commentsCount;
    private double avgPostsPerUser;
    private double avgCommentsPerUser;
    private double avgCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics){
        //...
    }

    public List<String> getUserNames() {
        return userNames;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAvgPostsPerUser() {
        return 1.0;
    }

    public double getAvgCommentsPerUser() {
        return 1.0;
    }

    public double getAvgCommentsPerPost() {
        return 1.0;
    }

    public void showStatistics() {
        System.out.printf("UserNames: %d\n", userNames);
        System.out.printf("Posts: %d\n", postsCount);
        System.out.printf("UserNames: %d\n", commentsCount);
        System.out.printf("Average posts per user: %d\n", avgPostsPerUser);
        System.out.printf("Average comments per user: %d\n", avgCommentsPerUser);
        System.out.printf("Average comments per post: %d\n", avgCommentsPerPost);
    }
}
