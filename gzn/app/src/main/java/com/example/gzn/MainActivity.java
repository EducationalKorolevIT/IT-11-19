package com.example.gzn;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sem(View viev){
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.append(((Button)viev).getText());
    }
    public void vos(View viev) {
        TextView txt = (TextView) findViewById(R.id.txt);
        txt.append(((Button) viev).getText());
    }
    public void nine(View viev){
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.append(((Button)viev).getText());}
    public void che(View viev){
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.append(((Button)viev).getText());}
    public void pya(View viev){
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.append(((Button)viev).getText());}
    public void she(View viev){
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.append(((Button)viev).getText());
           }
    public void tri(View viev){
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.append(((Button)viev).getText()); }
    public void dva(View viev){
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.append(((Button)viev).getText());}
    public void odi(View viev){
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.append(((Button)viev).getText());}
    public void del(View viev){
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.append(((Button)viev).getText());}
    public void plu(View viev){
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.append(((Button)viev).getText());}
    public void min(View viev){
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.append(((Button)viev).getText());}
    public void umn(View viev){
        TextView txt = (TextView)findViewById(R.id.txt);
        txt.append(((Button)viev).getText());}
}
