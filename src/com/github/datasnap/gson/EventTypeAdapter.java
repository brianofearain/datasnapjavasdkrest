package com.github.datasnap.gson;

import java.lang.reflect.Type;

import com.github.datasnap.propertiesandevents.Event;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class EventTypeAdapter
    implements JsonSerializer<Event>
{
  public JsonElement serialize(Event payload, Type type, JsonSerializationContext context) {
    return context.serialize(payload, payload.getClass());
  }
}
