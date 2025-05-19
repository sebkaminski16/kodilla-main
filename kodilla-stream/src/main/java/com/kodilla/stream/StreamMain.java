package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.ForumUserGender;

import java.time.Year;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> streamedUsers = forum.getForumUsers().stream()
                .filter(user -> Year.now().getValue() - user.getBirthday().getYear() >= 20 && user.getGender().equals(ForumUserGender.M) && user.getPublishedPostsCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getId, user -> user));

        streamedUsers.values().stream().forEach(System.out::println);
    }
}