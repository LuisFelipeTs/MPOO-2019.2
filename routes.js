const {Router}   = require("express")
const routes     = Router()

routes.get("/cardapio",(req,res)=>{
    let cardapio = {
        "segunda":{
            "cafe":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "almoco":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "jantar":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
        },
        "terca":{
            "cafe":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "almoco":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "jantar":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
        },
        "quarta":{
            "cafe":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "almoco":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "jantar":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
        },
        "quinta":{
            "cafe":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "almoco":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "jantar":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
        },
        "sexta":{
            "cafe":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "almoco":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "jantar":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
        },
        "sabado":{
            "cafe":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "almoco":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "jantar":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
        },
        "domingo":{
            "cafe":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "almoco":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
            "jantar":[{"comida": "pao" , "quantidade": "1x" , "kcal" : 65 },{"comida": "broa" , "quantidade": "1x" , "kcal" : 65 }],
        },
    }

    res.send(cardapio)


})

module.exports = routes