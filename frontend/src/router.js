
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import 주문관리OrderManager from "./components/listers/주문관리OrderCards"
import 주문관리OrderDetail from "./components/listers/주문관리OrderDetail"

import DeliveryDeliveryManager from "./components/listers/DeliveryDeliveryCards"
import DeliveryDeliveryDetail from "./components/listers/DeliveryDeliveryDetail"

import 상품관리인벤토리Manager from "./components/listers/상품관리인벤토리Cards"
import 상품관리인벤토리Detail from "./components/listers/상품관리인벤토리Detail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/주문관리/orders',
                name: '주문관리OrderManager',
                component: 주문관리OrderManager
            },
            {
                path: '/주문관리/orders/:id',
                name: '주문관리OrderDetail',
                component: 주문관리OrderDetail
            },

            {
                path: '/deliveries/deliveries',
                name: 'DeliveryDeliveryManager',
                component: DeliveryDeliveryManager
            },
            {
                path: '/deliveries/deliveries/:id',
                name: 'DeliveryDeliveryDetail',
                component: DeliveryDeliveryDetail
            },

            {
                path: '/상품관리/인벤토리',
                name: '상품관리인벤토리Manager',
                component: 상품관리인벤토리Manager
            },
            {
                path: '/상품관리/인벤토리/:id',
                name: '상품관리인벤토리Detail',
                component: 상품관리인벤토리Detail
            },



    ]
})
