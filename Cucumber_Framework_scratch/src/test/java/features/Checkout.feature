Feature: Place the order for products

@PlaceOrder
Scenario Outline: Search experience for product search in both home and offer page

Given User is on Greencart Landing Page
When user searched with shortname <Name> and extracted actual name of product
And Added "3" items of the selected product to cart
Then User proceeds to Checkout and validate the <Name> items to checkout page
And verify user has ability to enter promo code and place the order

Examples:
|Name |
|Tom  |

