Feature: Search and Place the order for products

@OffersPage
Scenario Outline: Search experience for product search in both home and offer page

Given User is on Greencart Landing Page
When user searched with shortname <Name> and extracted actual name of product
Then user searched for <Name> shortname in offer page
And validate product name in offers page matched with Landing page

Examples:
|Name |
|Tom  |
|Beet |
