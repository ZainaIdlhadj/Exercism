import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {JavaComponent} from './java/java.component';
import { MDBBootstrapModule } from 'angular-bootstrap-md';

const routes: Routes = [{path: 'javaTrack', component:JavaComponent }];

@NgModule({
  imports: [RouterModule.forRoot(routes),MDBBootstrapModule.forRoot()],
  exports: [RouterModule]
})

export class AppRoutingModule { 

}
