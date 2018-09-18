package com.kousenit.recipes.collections;

import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ImmutableMapTest {

    @Test
    public void immutableMapFromEntries() {
        Map<String, String> jvmLanguages = Map.ofEntries(
                Map.entry("Java", "com.kousenit.recipes.http://www.oracle.com/technetwork/java/index.html"),
                Map.entry("Groovy", "com.kousenit.recipes.http://groovy-lang.org/"),
                Map.entry("Scala", "com.kousenit.recipes.http://www.scala-lang.org/"),
                Map.entry("Clojure", "https://clojure.org/"),
                Map.entry("Kotlin", "com.kousenit.recipes.http://kotlinlang.org/"));

        Set<String> names = Set.of("Java", "Scala", "Groovy", "Clojure", "Kotlin");

        List<String> urls = List.of(
                "com.kousenit.recipes.http://www.oracle.com/technetwork/java/index.html",
                "com.kousenit.recipes.http://groovy-lang.org/",
                "com.kousenit.recipes.http://www.scala-lang.org/",
                "https://clojure.org/",
                "com.kousenit.recipes.http://kotlinlang.org/");

        Set<String> keys = jvmLanguages.keySet();
        Collection<String> values = jvmLanguages.values();
        names.forEach(name -> assertTrue(keys.contains(name)));
        urls.forEach(url -> assertTrue(values.contains(url)));

        Map<String, String> javaMap = Map.of(
                "Java",
                "com.kousenit.recipes.http://www.oracle.com/technetwork/java/index.html",
                "Groovy",
                "com.kousenit.recipes.http://groovy-lang.org/",
                "Scala",
                "com.kousenit.recipes.http://www.scala-lang.org/",
                "Clojure",
                "https://clojure.org/",
                "Kotlin",
                "com.kousenit.recipes.http://kotlinlang.org/");
        javaMap.forEach((name, url) -> assertTrue(
                jvmLanguages.keySet().contains(name) && jvmLanguages.values().contains(url)));
    }
}
