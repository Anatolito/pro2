/**
 * Пакет, который содержит контролеер для CartService.
 * * При переходе по "/api/cart/{id}" - вернется список продуктов
 *  * в корзине пользователя с указанным id.
 *  * При переходе по "/api/cart/{userId}/item/{itemId}" - будет
 *  * возможность изменить количество продукта в корзине пользователя
 *  * или удалить продукт из корзины.
 */
package business.hub.cartservice.controller;
