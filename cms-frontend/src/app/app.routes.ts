///<reference path="pages/address-data-list-page/address-data-list-page.component.ts"/>
import {Routes} from "@angular/router";
import {UserProfilePageComponent} from "./pages/user-profile-page/user-profile-page.component";
import {TeamListPageComponent} from "./pages/team-list-page/team-list-page.component";
import {ContractListPageComponent} from "./pages/contract-list-page/contract-list-page.component";
import {AddressDataListPageComponent} from "./pages/address-data-list-page/address-data-list-page.component";
import {ProjectListPageComponent} from "./pages/project-list-page/project-list-page.component";
import {ProjectTeamListPageComponent} from "./pages/project-team-list-page/project-team-list-page.component";
import {PersonProjectsListPageComponent} from "./pages/person-projects-list-page/person-projects-list-page.component";

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
    path: 'projects',
    component: ProjectListPageComponent
  },
  {
    path: 'projects/:id/people',
    component: ProjectTeamListPageComponent
  },
  {
    path: 'people',
    component: UserProfilePageComponent
  },
  {
    path: 'contracts/:id/person',
    component: PersonProjectsListPageComponent
  },
  {
    path: 'contracts/:id',
    component: UserProfilePageComponent
  },
  {
    path: '',
    redirectTo: '/user-profile',
    pathMatch: 'full'
  }
];
