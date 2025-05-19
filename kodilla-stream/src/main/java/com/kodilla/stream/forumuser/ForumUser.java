package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public class ForumUser {
    private final int id;
    private final String username;
    private final ForumUserGender gender; //Jak dwa do wyboru, to moze lepiej Enum? :)
    private final LocalDate birthday;
    private final int publishedPostsCount;

    public ForumUser(int id, String username, ForumUserGender gender, LocalDate birthday, int publishedPostsCount) {
        this.id = id;
        this.username = username;
        this.gender = gender;
        this.birthday = birthday;
        this.publishedPostsCount = publishedPostsCount;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPublishedPostsCount() {
        return publishedPostsCount;
    }

    public ForumUserGender getGender() {
        return gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return id == forumUser.id && publishedPostsCount == forumUser.publishedPostsCount && Objects.equals(username, forumUser.username) && gender == forumUser.gender && Objects.equals(birthday, forumUser.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, gender, birthday, publishedPostsCount);
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthday=" + birthday +
                ", publishedPostsCount=" + publishedPostsCount +
                '}';
    }
}
