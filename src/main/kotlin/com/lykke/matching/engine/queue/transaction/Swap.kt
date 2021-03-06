package com.lykke.matching.engine.queue.transaction

import com.lykke.matching.engine.daos.bitcoin.Orders

class Swap(var MultisigCustomer1: String? = null, var Amount1: Double, var Asset1: String? = null,
           var MultisigCustomer2: String? = null, var Amount2: Double, var Asset2: String? = null,
           var TransactionId: String? = null,
           @Transient var clientId1: String, @Transient var origAsset1: String,
           @Transient var clientId2: String, @Transient var origAsset2: String,
           @Transient var orders: Orders): Transaction {
    //Swap:{"TransactionId":"10", MultisigCustomer1:"2N8zbehwdz2wcCd2JwZktnt6uKZ8fFMZVPp", "Amount1":200, "Asset1":"TestExchangeUSD", MultisigCustomer2:"2N8Z7FLao3qWc8h8mveDXaAA9q1Q53xMsyL", "Amount2":300, "Asset2":"TestExchangeEUR"}
}