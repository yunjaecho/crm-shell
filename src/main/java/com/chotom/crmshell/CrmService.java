package com.chotom.crmshell;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class CrmService implements InitializingBean {
    boolean isConnected() {
        return false;
    }

    void connect(String usr, String pw) {

    }

    void disconnect() {

    }

    Person findById(Long id) {
        return null;
    }

    Collection<Person> findByName(String name) {
        return null;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        AtomicLong ids = new AtomicLong();
        Map<Long, Person> personMap = Stream.of("Brian Dussalt","Brian Clozel", "Stephane Maldini")
                .map(name -> new Person(ids.incrementAndGet(), name))
                .collect(Collectors.toMap(Person::getId, p -> p));
    }
}
