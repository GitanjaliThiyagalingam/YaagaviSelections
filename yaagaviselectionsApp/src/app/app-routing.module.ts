import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ProductsComponent } from './products/products.component';
import { ProductTypeComponent } from './product-type/product-type.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { SigninpageComponent } from './signinpage/signinpage.component';
import { AuthGuard } from './auth/auth.guard';
import { RegisterComponent } from './register/register.component';
import { UserprofileComponent } from './userprofile/userprofile.component';

const routes: Routes = [
  { path: '', component: ProductTypeComponent},
  { path: 'products/:id', component: ProductsComponent},
  { path: 'product-detail/:id', component: ProductDetailComponent},
  { path: 'signinpage', component: SigninpageComponent},
  { path: 'register', component: RegisterComponent},
  { path: 'userprofile', component:UserprofileComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
