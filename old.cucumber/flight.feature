Feature: flight
  Scenario Outline: flight leaving
    Given the flight <flightno> is leaving today

    Examples:
    |flightno|
    |C038|
    |BA01618|
    |EZY4567|