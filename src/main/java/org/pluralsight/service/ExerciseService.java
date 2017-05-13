package org.pluralsight.service;

import org.pluralsight.model.Activity;

import java.util.List;


public interface ExerciseService {
    List<Activity> findAllActivities();
}
