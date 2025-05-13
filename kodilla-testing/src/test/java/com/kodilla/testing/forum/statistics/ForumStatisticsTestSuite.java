package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {
    @Mock
    private Statistics statisticsMock;

    @Test
    void testCalculateAdvStatisticsPostsCount0() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator();
        //When
        statCalc.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0.0, statCalc.getAvgPostsPerUser());
        Assertions.assertEquals(0.0, statCalc.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsPostsCount1000() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator();
        List<String> userNames = new ArrayList<>();
        for(int i = 0; i < 10; i++) userNames.add("User " + i);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.commentsCount()).thenReturn(10000);
        //When
        statCalc.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(100.0, statCalc.getAvgPostsPerUser());
        Assertions.assertEquals(10.0, statCalc.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsUserNames0() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator();
        //When
        statCalc.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0.0, statCalc.getAvgPostsPerUser());
        Assertions.assertEquals(0.0, statCalc.getAvgCommentsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsUserNames100() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator();
        List<String> userNames = new ArrayList<>();
        for(int i = 0; i < 100; i++) userNames.add("User " + i);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        statCalc.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(1.0, statCalc.getAvgPostsPerUser());
        Assertions.assertEquals(1.0, statCalc.getAvgCommentsPerUser());
    }

    @Test
    void testCalculateAdvStatisticsCommentsCount0() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator();
        //When
        statCalc.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0.0, statCalc.getAvgCommentsPerUser());
        Assertions.assertEquals(0.0, statCalc.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsCommentsCountLessThanPostsCount() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator();
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(1000);
        //When
        statCalc.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(0.1, statCalc.getAvgCommentsPerPost());
    }

    @Test
    void testCalculateAdvStatisticsCommentsCountGreaterThanPostsCount() {
        //Given
        StatisticsCalculator statCalc = new StatisticsCalculator();
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.postsCount()).thenReturn(100);
        //When
        statCalc.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(10.0, statCalc.getAvgCommentsPerPost());
    }
}
