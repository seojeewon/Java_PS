{\rtf1\ansi\ansicpg949\cocoartf2636
\cocoatextscaling0\cocoaplatform0{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
{\*\expandedcolortbl;;}
\paperw11900\paperh16840\margl1440\margr1440\vieww11520\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural\partightenfactor0

\f0\fs24 \cf0 import java.util.*;\
import java.io.*;\
\
public class Main\{\
    public static void main(String[] args) throws IOException\{\
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));\
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));\
        int value = 2541-1998;\
        int y = Integer.parseInt(bf.readLine());\
        bw.write(String.valueOf(y-value));\
        bw.close();\
    \}\
\}}