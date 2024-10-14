import { NextRequest } from "next/server";
import { PrismaClient } from "@prisma/client";
const client = new PrismaClient();
export async function POST (req:NextRequest){

    // extract the body 
    const body = await req.json();
    client.user.create({
      data:{
        username :body.username,
        password:body.password
      }
    })

    return Response.json({
        message:"user is login bro!!"
    })
}

export async function GET() {
    return Response.json({ username: "ujjwal", email: "ujjwalsinha418@gmail.com" })
  }
