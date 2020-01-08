package app.model;

import app.entities.UserTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();

    private List<UserTest> model;

    public static Model getInstance() {
        return instance;
    }

    private Model() {
        model = new ArrayList<>();
    }

    public void add(UserTest userTest) {
        model.add(userTest);
    }

    public List<String> list() {
        return model.stream()
                .map(UserTest::getName)
                .collect(Collectors.toList());
    }
}
