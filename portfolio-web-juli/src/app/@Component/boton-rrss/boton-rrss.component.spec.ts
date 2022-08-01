import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BotonRrssComponent } from './boton-rrss.component';

describe('BotonRrssComponent', () => {
  let component: BotonRrssComponent;
  let fixture: ComponentFixture<BotonRrssComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BotonRrssComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BotonRrssComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
