package ru.sberbank.lab2ser;

import com.google.protobuf.InvalidProtocolBufferException;
import org.openjdk.jmh.annotations.*;
import ru.sberbank.lab2ser.model.EntryProto;
import ru.sberbank.lab2ser.model.TestDataCreator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

public class ProtoBench {

    @Benchmark
    @Fork(value = 1, warmups = 2)
    @BenchmarkMode(Mode.Throughput)
    @Threads(4)
    public static void proto() throws InvalidProtocolBufferException {
            EntryProto.DeliveryEntry entry = TestDataCreator.instantiateProto();

            byte[] serialized = entry.toByteArray();

            EntryProto.DeliveryEntry res = EntryProto.DeliveryEntry.newBuilder()
                    .mergeFrom(serialized)
                    .build();
    }
}
