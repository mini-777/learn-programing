const express = require('express')
const app = express()
const port = 3000

app.use(express.static('public'))

app.get('/', (req, res) => res.send('Hello World!'))

app.get('/weather', function(req,res){
  var request = require('request');
  var url = 'http://apis.data.go.kr/1360000/VilageFcstInfoService/getUltraSrtNcst?serviceKey=jTD5BEAbCsM2ddtTbZqVrWgTXWlikqIJdhTgKJ9l5ZOha1/AjCes9bir/TIPqBiuOWraRPpgXfpVpheBjcI0ww==';
  
  var base_date = req.query.base_date;
  var base_time = req.query.base_time;
  var nx = req.query.nx;
  var ny = req.query.ny;
  var dataType = req.query.dataType;

  url = url + "&base_date=" + base_date +"&base_time=" + base_time +"&nx=" + nx +"&ny=" + ny +"&dataType=" + dataType;
  
  var options = {
    'method': 'GET',
    'url': url,
    'headers': {
      'Cookie': 'JSESSIONID=YbheBH5epfuAgp6hSuD0ZDA8ZSp0qWPxyYGwAiJSpYEUrAqX4T3Qy9ATLtjFOtPZ.amV1c19kb21haW4vbmV3c2t5Mw=='
    }
  };
  request(options, function (error, response) {
    if (error) throw new Error(error);
    console.log(response.body);
    res.send(response.body);
  });
})

app.get('/Path1', function (req, res) {
        res.send("GET Path1");
    })
app.get('/Path2', function(req,res) {
        res.send("GET Path2 : " + Date());
    })
app.put('/Path1', function (req, res) {
        res.send("PUT Path1");
    })


app.listen(port, () => console.log(`Example app listening at http://localhost:${port}`))