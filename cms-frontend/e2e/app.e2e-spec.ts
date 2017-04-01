import { CmsFrontendPage } from './app.po';

describe('cms-frontend App', () => {
  let page: CmsFrontendPage;

  beforeEach(() => {
    page = new CmsFrontendPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
