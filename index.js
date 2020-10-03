
const routes = require("./routes")

const express    =  require("express")
const app = express()

app.use(routes)



app.listen(3333, '192.168.0.7', () => {
    console.log('Running on ip 192.168.0.7:3333');
});