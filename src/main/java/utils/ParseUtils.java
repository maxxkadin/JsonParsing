package utils;

import com.google.gson.Gson;
import com.google.gson.*;
import domain.Person;
import exceptions.ParameterIsNotJsonStringException;

public class ParseUtils {

    public static Person parseJsonToPersonDirect(String jsonString) throws ParameterIsNotJsonStringException {
        if (!jsonString.startsWith("{")){
            throw new ParameterIsNotJsonStringException();
        }
        Gson tempGson = new Gson();
        Person tempPerson = tempGson.fromJson(jsonString, Person.class);
        return tempPerson;
    }

    public static Person parseJsonToPersonManual(String jsonString) {
        JsonParser jsonParser = new JsonParser();
        JsonElement rootElement = jsonParser.parse(jsonString);
        JsonObject rootObject = rootElement.getAsJsonObject();
        var firstName = rootObject.getAsJsonPrimitive("name").getAsString();
        var lastName = rootObject.getAsJsonPrimitive("last").getAsString();
        var year = rootObject.getAsJsonPrimitive("dob").getAsInt();
        return new Person(firstName, lastName, year);
    }

}
