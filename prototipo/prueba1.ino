int val=0;
int pinInt = 4;
void setup() {
  // put your setup code here, to run once:
 pinMode(pinInt,INPUT);
 Serial.begin(9600);
 while(Serial.available()){
  Serial.read();
  }
}

void loop() {
  // put your main code here, to run repeatedly:
val = digitalRead(pinInt);
Serial.print(val);

delay(1000);
}


