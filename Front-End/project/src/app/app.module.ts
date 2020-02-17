import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { JavaComponent } from './java/java.component';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { ElementComponent } from './element/element.component';
import { ItemServiceService } from './services/item-service.service';

import { HttpClientModule } from '@angular/common/http';
import { FilterComponent } from './filter/filter.component';

@NgModule({
  declarations: [
    AppComponent,
    JavaComponent,
    HeaderComponent,
    FooterComponent,
    ElementComponent,
    FilterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
