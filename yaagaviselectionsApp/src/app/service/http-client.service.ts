import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { LoginResultModel } from '../auth/LoginResultModel';

export class Product {
  constructor(
    public id:string,
    public name:string,
    public price: number,
    public image:any,
    public description: string,
    public quantity: number
  ) {}
}

export class ProductType {
  constructor(
    public id:string,
    public type:string,
    public name:string,
    public image:any,
  ) {}
}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(
    private httpClient:HttpClient
  ) { 
    
  }
  getProducts(id: string)
  {
    console.log("get Products");
    return this.httpClient.get<Product[]>('http://localhost:8080/api/products/productType/' + id);
  }
  
  getProductTypes()
  {
    console.log("get ProductTypes");
    return this.httpClient.get<ProductType[]>('http://localhost:8080/api/products/productTypes');
  }

  getProductById(id: string)
  {
    console.log("get Product Details");
    return this.httpClient.get<Product>('http://localhost:8080/api/products/product/' + id);
  }

  login(username: string, password: string): Observable<LoginResultModel>{
    return this.httpClient.post<LoginResultModel>('http://localhost:8080/login', {
      userName: username,
      password: password
    });
  }
}
