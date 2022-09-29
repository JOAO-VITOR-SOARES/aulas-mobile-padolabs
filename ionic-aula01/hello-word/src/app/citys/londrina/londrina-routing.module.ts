import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { londrinaPage } from './londrina.page';

const routes: Routes = [
  {
    path: '',
    component: londrinaPage
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class londrinaPageRoutingModule {}
