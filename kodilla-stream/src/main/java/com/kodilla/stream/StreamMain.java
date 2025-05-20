package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.ForumUserGender;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> streamedUsers = forum.getForumUsers().stream()
                .filter(user ->
                        //https://docs.oracle.com/javase/8/docs/api/java/time/Period.html#between-java.time.LocalDate-java.time.LocalDate-
                        //Period.between zwraca ilosc dni, miesiecy lub lat pomiedzy dwoma obiektami LocalDate
                        Period.between(user.getBirthday(), LocalDate.now()).getYears() >= 20
                        && user.getGender().equals(ForumUserGender.M)
                        && user.getPublishedPostsCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        streamedUsers.values().stream().forEach(System.out::println);
    }
}