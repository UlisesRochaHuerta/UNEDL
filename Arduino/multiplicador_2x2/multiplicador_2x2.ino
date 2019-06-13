int entradaA0=12,entradaA1=13,entradaB0=10,entradaB1=11,salidaM3=7;
int salidaM2=6,salidaM1=5,salidaM0=4;
void setup() {
  // put your setup code here, to run once:
pinMode(entradaA0,INPUT);
pinMode(entradaA1,INPUT);
pinMode(entradaB0,INPUT);
pinMode(entradaB1,INPUT);
pinMode(salidaM3,OUTPUT);
pinMode(salidaM2,OUTPUT);
pinMode(salidaM1,OUTPUT);
pinMode(salidaM0,OUTPUT);

//ulises isaac rocha huerta
}

void loop() {
  // put your main code here, to run repeatedly:
  int a0 = digitalRead(entradaA0),a1 = digitalRead(entradaA1);
  int b0 = digitalRead(entradaB0),b1 = digitalRead(entradaB1);
  
  if(a0==LOW&&a1==LOW&&b0==LOW&&b1==LOW){//           1111
    digitalWrite(salidaM0,LOW);
    digitalWrite(salidaM1,HIGH);
    digitalWrite(salidaM2,HIGH);
    digitalWrite(salidaM3,LOW);
  }else if(a0==LOW&&a1==LOW&&b0==LOW&&b1==HIGH){//    1110
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,LOW);
    digitalWrite(salidaM2,LOW);
    digitalWrite(salidaM3,HIGH);
  }else if(a0==LOW&&a1==HIGH&&b0==LOW&&b1==LOW){//    1011
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,LOW);
    digitalWrite(salidaM2,LOW);
    digitalWrite(salidaM3,HIGH);
  }else if(a0==LOW&&a1==LOW&&b0==HIGH&&b1==LOW){//    1101
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,HIGH);
    digitalWrite(salidaM2,LOW);
    digitalWrite(salidaM3,LOW);
  }else if(a0==LOW&&a1==LOW&&b0==HIGH&&b1==HIGH){//    1100
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,HIGH);
    digitalWrite(salidaM2,HIGH);
    digitalWrite(salidaM3,HIGH);
  }else if(a0==LOW&&a1==HIGH&&b0==LOW&&b1==HIGH){//   1010
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,LOW);
    digitalWrite(salidaM2,HIGH);
    digitalWrite(salidaM3,HIGH);
  }else if(a0==LOW&&a1==HIGH&&b0==HIGH&&b1==LOW){//   1001
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,HIGH);
    digitalWrite(salidaM2,LOW);
    digitalWrite(salidaM3,HIGH);
  }else if(a0==LOW&&a1==HIGH&&b0==HIGH&&b1==HIGH){//  1000
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,HIGH);
    digitalWrite(salidaM2,HIGH);
    digitalWrite(salidaM3,HIGH);
  }if(a0==HIGH&&a1==LOW&&b0==LOW&&b1==LOW){//    0111
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,HIGH);
    digitalWrite(salidaM2,LOW);
    digitalWrite(salidaM3,LOW);
  }else if(a0==HIGH&&a1==LOW&&b0==LOW&&b1==HIGH){//   0110
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,HIGH);
    digitalWrite(salidaM2,LOW);
    digitalWrite(salidaM3,HIGH);
  }else if(a0==HIGH&&a1==LOW&&b0==HIGH&&b1==LOW){//   0101
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,HIGH);
    digitalWrite(salidaM2,HIGH);
    digitalWrite(salidaM3,LOW);
  }else if(a0==HIGH&&a1==HIGH&&b0==HIGH&&b1==LOW){//  0001
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,HIGH);
    digitalWrite(salidaM2,HIGH);
    digitalWrite(salidaM3,HIGH);
  }else if(a0==HIGH&&a1==HIGH&&b0==LOW&&b1==HIGH){//  0010
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,HIGH);
    digitalWrite(salidaM2,HIGH);
    digitalWrite(salidaM3,HIGH);
  }else if(a0==HIGH&&a1==HIGH&&b0==LOW&&b1==LOW){//   0011
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,HIGH);
    digitalWrite(salidaM2,HIGH);
    digitalWrite(salidaM3,HIGH);
  }else if(a0==HIGH&&a1==LOW&&b0==HIGH&&b1==HIGH){//  0100
    digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,HIGH);
    digitalWrite(salidaM2,HIGH);
    digitalWrite(salidaM3,HIGH);
  }

  
  
  digitalWrite(salidaM0,HIGH);
    digitalWrite(salidaM1,HIGH);
    digitalWrite(salidaM2,HIGH);
    digitalWrite(salidaM3,HIGH);

}
