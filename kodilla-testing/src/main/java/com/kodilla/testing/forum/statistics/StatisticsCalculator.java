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
        userNames = statistics.usersNames();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();
        if(userNames.isEmpty()) {
            avgPostsPerUser = 0;
            avgCommentsPerUser = 0;
        } else {
            avgPostsPerUser = (double) postsCount / userNames.size();
            avgCommentsPerUser = (double) commentsCount / userNames.size();
        }
        if(postsCount == 0) {
            avgCommentsPerPost = 0;
        } else {
            avgCommentsPerPost = (double) commentsCount / postsCount;
        }
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
        return avgPostsPerUser;
    }

    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }

    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
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
