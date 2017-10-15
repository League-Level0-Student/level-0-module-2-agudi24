int cookies = 0;
boolean cookieClicked;
void setup(){
  size(600, 800);
}
void draw(){
  background(#97EAFA);
  if(mousePressed){
  noStroke();
  fill(180, 111, 5);
  ellipse(300, 400, 170, 170);
  fill(82, 50, 1);
  ellipse(250, 375, 10, 20);
  ellipse(246, 424, 15, 20);
  ellipse(335, 431, 20, 20);
  ellipse(342, 378, 10, 20);
  ellipse(305, 342, 15, 20);
  ellipse(361, 362, 20, 20);
  ellipse(305, 405, 10, 20); 
  }
  else{
  noStroke();
  fill(180, 111, 5);
  ellipse(300, 400, 200, 200);
  fill(82, 50, 1);
  ellipse(250, 375, 10, 20);
  ellipse(246, 424, 15, 20);
  ellipse(335, 431, 20, 20);
  ellipse(342, 378, 10, 20);
  ellipse(305, 342, 15, 20);
  ellipse(361, 362, 20, 20);
  ellipse(305, 405, 10, 20);
  text(cookies + " Cookies", 250, 600);
  textSize(20);
}
}
void mouseClicked(){
  cookies++;
}