<template>

    <v-data-table
        :headers="headers"
        :items="주문이력"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: '주문이력View',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            주문이력 : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/주문이력'))

            temp.data._embedded.주문이력.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.주문이력 = temp.data._embedded.주문이력;
        },
        methods: {
        }
    }
</script>

