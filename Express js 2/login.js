import  express from 'express';
import  bodyParser from'body-parser';
import path from 'path';

const app = express();
const port = 3000;
const __dirname = path.resolve();

app.use(bodyParser.urlencoded({ extended: true }));


app.set('views', path.join(__dirname, 'views'));
app.set('view engine', 'pug');


const users = [
  { username: 'admin', password: 'admin123' },
  { username: 'user', password: 'user123' },
];


app.get('/', (req, res) => {
  res.render('login'); 
});


app.post('/signup', (req, res) => {
  const { username, email ,password } = req.body;


  const user = {
    username ,
    email ,
    password
  };

  if (user) {
    users.push(user);
    res.render('success', { username: user.username });
  } else {
    res.render('login', { error: 'Invalid username or password' });
  }
});

app.post('/login', (req, res) => {
    const { username, password } = req.body;
  
    
    const user = users.find(u => u.username === username && u.password === password);
  
    if (user) {
      res.render('success', { username: user.username });
    } else {
      res.render('login', { error: 'Invalid username or password' });
    }
  });


app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});
