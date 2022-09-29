import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

import { IonicModule } from '@ionic/angular';

import {londrinaPageRoutingModule } from './londrina-routing.module';

import { londrinaPage } from './londrina.page';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    IonicModule,
    londrinaPageRoutingModule
  ],
  declarations: [londrinaPage]
})
export class londrinaPageModule {}
