package ru.sberbank.lab2ser;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.*;
import ru.sberbank.lab2ser.model.DeliveryEntry;
import ru.sberbank.lab2ser.model.TestDataCreator;

import java.io.IOException;

public class JsonBench {
    private static final ObjectMapper mapper = new ObjectMapper();

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.Throughput)
    @Threads(4)
    public static void execute() throws IOException {
        DeliveryEntry entry = TestDataCreator.instantiate();

        String json = mapper.writeValueAsString(entry);
        DeliveryEntry parsed = mapper.readValue(json, DeliveryEntry.class);
    }
}
