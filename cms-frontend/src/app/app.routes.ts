///<reference path="pages/address-data-list-page/address-data-list-page.component.ts"/>
import {Routes} from "@angular/router";
import {UserProfilePageComponent} from "./pages/user-profile-page/user-profile-page.component";
import {TeamListPageComponent} from "./pages/team-list-page/team-list-page.component";
import {ContractListPageComponent} from "./pages/contract-list-page/contract-list-page.component";
import {AddressDataListPageComponent} from "./pages/address-data-list-page/address-data-list-page.component";

export const appRoutes: Routes = [
  {
    path: 'user-profile',
    component: UserProfilePageComponent
  },
  {
    path: 'teams',
    component: TeamListPageComponent
  },
  {
    path: 'contracts',
    component: ContractListPageComponent
  },
  {
    path: 'addresses',
    component: AddressDataListPageComponent
  },
  {
    path: '',
    redirectTo: '/user-profile',
    pathMatch: 'full'
  }
];
