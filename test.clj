(import org.ej4tezos.api.TezosFeeService
        org.ej4tezos.api.model.TezosBlock
        org.ej4tezos.impl.TezosConnectivityImpl
        org.ej4tezos.papi.TezosConnectivity
        org.ej4tezos.utils.asserts.Asserts
        org.ej4tezos.api.TezosCoreService
        org.ej4tezos.impl.TezosCoreServiceImpl
        org.ej4tezos.crypto.impl.TezosCryptoProviderImpl
        org.ej4tezos.crypto.impl.TezosKeyServiceImpl
        org.ej4tezos.model.TezosContractAddress
        org.ej4tezos.model.TezosPrivateKey
        org.ej4tezos.impl.TezosConnectivityImpl)

(def address (. org.ej4tezos.model.TezosAddress toTezosAddress "tz1LMxo1riJNxjSx8o8vi7DrCj9Ct1yepLze"))

(def pk (. org.ej4tezos.model.TezosPrivateKey
           (toTezosPrivateKey "edsk4LzAuuQF1FkFHV5qXmpL8a5YNtJh1pTtkAYjAVBKCSAbp6LCCD")))

(def tc (new TezosConnectivityImpl))

(def tc (new org.ej4tezos.impl.TezosConnectivityImpl))
(. tc (setNodeUrl "http://granada.newby.org:8732"))
(. tc (init))

(def tcs (new TezosCryptoProvider))

(def tks (new TezosKeyServiceImpl))

(. tc (setTezosCryptoProvider (new
