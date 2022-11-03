db = db.getSiblingDB('carCards');

db.createCollection('car');

db.car.insertMany([
    {
        "imageUrl": "images/Auto.png",
        "tradeName": "Audi",
        "model": "Flaschback 300",
        "prize": 50000
    },
    {
        "imageUrl": "images/Auto.png",
        "tradeName": "Opel",
        "model": "Manta SE",
        "prize": 20000
    },
    {
        "imageUrl": "images/Auto.png",
        "tradeName": "VW",
        "model": "Golf GL",
        "prize": 12000
    },
    {
        "imageUrl": "images/Auto.png",
        "tradeName": "Fiat",
        "model": "500",
        "prize": 15000
    }
]);

db.createCollection('game');

db.game.insertMany([
    {
        "startTime": "12:45"
    },
    {
        "leftcars": [
            {
                "imageUrl": "images/Auto.png",
                "tradeName": "Audi",
                "model": "Flaschback 300",
                "prize": 50000
            },
            {
                "imageUrl": "images/Auto.png",
                "tradeName": "Opel",
                "model": "Manta SE",
                "prize": 20000
            },
            {
                "imageUrl": "images/Auto.png",
                "tradeName": "VW",
                "model": "Golf GL",
                "prize": 12000
            }
        ]

    },
    {
        "rightcars": [
            {
                "imageUrl": "images/Auto.png",
                "tradeName": "Opel",
                "model": "Manta SE",
                "prize": 20000
            },
            {
                "imageUrl": "images/Auto.png",
                "tradeName": "VW",
                "model": "Golf GL",
                "prize": 12000
            },
            {
                "imageUrl": "images/Auto.png",
                "tradeName": "Fiat",
                "model": "500",
                "prize": 15000
            }
        ]
    },
    {
        "battles": [
            {
                "leftcar": {
                    "imageUrl": "images/Auto.png",
                    "tradeName": "Opel",
                    "model": "Manta SE",
                    "prize": 20000
                },
                "rightcar": {
                    "imageUrl": "images/Auto.png",
                    "tradeName": "Opel",
                    "model": "Manta SE",
                    "prize": 20000
                },
                "winner": "leftside"
            },
            {
                "leftcar": {
                    "imageUrl": "images/Auto.png",
                    "tradeName": "Audi",
                    "model": "Flaschback 300",
                    "prize": 50000
                },
                "rightcar": {
                    "imageUrl": "images/Auto.png",
                    "tradeName": "Fiat",
                    "model": "500",
                    "prize": 15000
                },
                "winner": "rightside"
            },
            {
                "leftcar": {
                    "imageUrl": "images/Auto.png",
                    "tradeName": "Opel",
                    "model": "Manta SE",
                    "prize": 20000
                },
                "rightcar": {
                    "imageUrl": "images/Auto.png",
                    "tradeName": "VW",
                    "model": "Golf GL",
                    "prize": 12000
                },
                "winner": "rightside"
            }
        ]
    },
    {
        "winner": "rightside"
    },

    {
        "wintime": "13:00"
    }
])