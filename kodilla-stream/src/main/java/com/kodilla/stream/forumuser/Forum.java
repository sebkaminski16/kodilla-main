package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;

public class Forum {
    private final ArrayList<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        this.forumUsers.add(new ForumUser(1, "user1", ForumUserGender.M, LocalDate.of(2000, 5, 11), 10));
        this.forumUsers.add(new ForumUser(2, "user2", ForumUserGender.F, LocalDate.of(1998, 3, 21), 0));
        this.forumUsers.add(new ForumUser(3, "user3", ForumUserGender.M, LocalDate.of(1988, 4, 23), 1));
        this.forumUsers.add(new ForumUser(4, "user4", ForumUserGender.F, LocalDate.of(1999, 9, 18), 4));
        this.forumUsers.add(new ForumUser(5, "user5", ForumUserGender.M, LocalDate.of(1994, 10, 5), 5));
        this.forumUsers.add(new ForumUser(6, "user6", ForumUserGender.F, LocalDate.of(1975, 12, 9), 8));
        this.forumUsers.add(new ForumUser(7, "user7", ForumUserGender.M, LocalDate.of(1979, 1, 8), 60));
    }

    public ArrayList<ForumUser> getForumUsers() {
        return new ArrayList<>(forumUsers);
    };
}
