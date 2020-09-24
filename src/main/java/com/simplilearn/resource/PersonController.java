/*
 * package com.simplilearn.resource;
 * 
 * import org.springframework.metrics.instrument.MeterRegistry; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * 
 * @RestController
 * 
 * @Timed class PersonController { Map<Integer, Person> people = new
 * Map<Integer, Person>();
 * 
 * public PersonController(MeterRegistry registry) { // constructs a gauge to
 * monitor the size of the population registry.mapSize("population", people); }
 * 
 * @GetMapping("/api/people") public List<Person> listPeople() { return people;
 * }
 * 
 * @GetMapping("/api/person/") public Person findPerson(@PathVariable Integer
 * id) { return people.get(id); } }
 * 
 */