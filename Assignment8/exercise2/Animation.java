/*
package exercise2;

import javafx.animation.*;
import javafx.application.Application;
import javafx.event.*;
import javafx.geometry.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.shape.*;
*/

public class Animation extends Application{
	@Override 
	public void start(Stage stage) {
		
		//Masterpane
		FlowPane master = new FlowPane();

		
		//Lets make the menus 
		MenuBar menuBar = new MenuBar();
		
		
		Menu menu1 = new Menu("Sphere");
		MenuItem sphereRotate = new MenuItem("Rotate");
		MenuItem sphereScale = new MenuItem("Scale");
		MenuItem sphereSequence = new MenuItem("Sequence");
		//Add the items to the sphere menu
		menu1.getItems().addAll(sphereRotate, sphereScale, sphereSequence);

		//Box menu
		MenuBar menuBar2 = new MenuBar();
		Menu menu2 = new Menu("Box");
		MenuItem boxRotate = new MenuItem("Rotate");
		MenuItem boxScale = new MenuItem("Scale");
		MenuItem boxSequence = new MenuItem("Sequence");
		//Add the items
		menu2.getItems().addAll(boxRotate, boxScale, boxSequence);
		
		
		//Cylinder menu
		MenuBar menuBar3 = new MenuBar();
		Menu menu3 = new Menu("Cylinder");
		MenuItem cylinderRotate = new MenuItem("Rotate");
		MenuItem cylinderScale = new MenuItem("Scale");
		MenuItem cylinderSequence = new MenuItem("Sequence");
		//Add the items
		menu3.getItems().addAll(cylinderRotate, cylinderScale, cylinderSequence);
		
		
		//Polygon menu
		MenuBar menuBar4 = new MenuBar();
		Menu menu4 = new Menu("Polygon");
		MenuItem polygonRotate = new MenuItem("Rotate");
		MenuItem polygonScale = new MenuItem("Scale");
		MenuItem polygonSequence = new MenuItem("Sequence");
		MenuItem polygonTransition = new MenuItem("Transition");
		//Add the items
		menu4.getItems().addAll(polygonRotate, polygonScale, polygonTransition, polygonSequence);
		
		//Add submenus to the menubar
		menuBar.getMenus().addAll(menu1, menu2, menu3,menu4);
		
		//Gridpane for the animations
		GridPane layout = new GridPane();

		//We can set the columnn width proportional to the entire pane 
		 ColumnConstraints column1 = new ColumnConstraints();
		 column1.setPercentWidth(50);
		 ColumnConstraints column2 = new ColumnConstraints();
		 column2.setPercentWidth(50);
		 layout.getColumnConstraints().addAll(column1, column2); 
		 
		 //same with rows. 
		 RowConstraints row1 = new RowConstraints();
		 row1.setPercentHeight(50);
		 RowConstraints row2 = new RowConstraints();
		 row2.setPercentHeight(50);
		 layout.getRowConstraints().addAll(row1, row2); 
		 
		 //makes gridlines visible
		layout.setGridLinesVisible(true);
		
		//Now we add animations 
		Sphere sphere = new Sphere(20.0);
		PhongMaterial phMaterial1 = new PhongMaterial();
		phMaterial1.setDiffuseColor(Color.YELLOW);
		sphere.setMaterial(phMaterial1);
		
		Box box = new Box(20.0,20.0,20.0);
		PhongMaterial phMaterial2 = new PhongMaterial();
		phMaterial2.setDiffuseColor(Color.RED);
		box.setMaterial(phMaterial2);
		
		Cylinder cylinder = new Cylinder(10.0, 50);
		PhongMaterial phMaterial3 = new PhongMaterial();
		phMaterial3.setDiffuseColor(Color.BURLYWOOD);
		cylinder.setMaterial(phMaterial3);
		
		Polygon polygon = new Polygon();
		polygon.getPoints().addAll(new Double[]{
				   50.0, 12.5, 
				   100.0, 12.5, 
				   115.5, 32.5,          
				   100.0, 62.5, 
				   50.0, 62.5,                   
				   32.5, 32.5,  });
		polygon.setFill(Color.RED);

		
		//Add the animations to the grid. 
		layout.addRow(0, sphere, box);
		layout.addRow(1, cylinder, polygon);
		layout.setMinSize(450, 250);
		layout.setStyle("-fx-background-color: #81BEF7;");
		
		
		//Alignment taken from:
// https://stackoverflow.com/questions/25852959/center-align-rows-of-a-gridpane-in-javafx
		
		Shape3D[] shapes = {sphere, box, cylinder};
		for(Shape3D shape: shapes) {
		GridPane.setHalignment(shape, HPos.CENTER); // To align horizontally in the cell
		GridPane.setValignment(shape, VPos.CENTER); // To align vertically in the cell
		}
		//Polygon is not a shape3d
		GridPane.setHalignment(polygon, HPos.CENTER); // To align horizontally in the cell
		GridPane.setValignment(polygon, VPos.CENTER); // To align vertically in the cell
		
		
		
		//Add event handling 
		EventHandler<ActionEvent> sphereHandler = new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		    	if(event.getSource() == sphereRotate) {
		    		RotateTransition rt = new RotateTransition(Duration.millis(5000), sphere);
		    	    rt.setByAngle(180);//The amount we rotate by
		    	    rt.setCycleCount(1);//Tells the rotation method how many times it should work
		    	    rt.setAutoReverse(true);//Goes in reverse after completing. 
		    	    rt.play();
		    	}
		    	
		        if(event.getSource() == sphereScale) {
		    	    
		    	    //Scale transition
		    	     ScaleTransition st = new ScaleTransition(Duration.millis(2000), sphere);
		    	     st.setByX(1.5f);
		    	     st.setByY(1.5f);
		    	     st.setCycleCount(2);
		    	     st.setAutoReverse(true);
		    	     st.play();
		        }
		        
		        if(event.getSource() == sphereSequence) {
		   	     //Sequential 
		   	     final Duration SEC_2 = Duration.millis(2000);
		   	     final Duration SEC_3 = Duration.millis(3000);
		   	     PauseTransition pt = new PauseTransition(Duration.millis(1000));
		   	    
		   	     RotateTransition rt2 = new RotateTransition(SEC_3);
		   	     rt2.setByAngle(180f);
		   	     rt2.setCycleCount(1);
		   	     rt2.setAutoReverse(true);
		   	     ScaleTransition st2 = new ScaleTransition(SEC_2);
		   	     st2.setByX(1.5f);
		   	     st2.setByY(1.5f);
		   	     st2.setCycleCount(2);
		   	     st2.setAutoReverse(true);
		   	     SequentialTransition seqT = new SequentialTransition (sphere, rt2, st2);
		   	     seqT.play();
		        	
		        }
		    }
		};
		
		sphereScale.setOnAction(sphereHandler);
		sphereRotate.setOnAction(sphereHandler);
		sphereSequence.setOnAction(sphereHandler);
		
		
		//Add event handling 
		EventHandler<ActionEvent> boxHandler = new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		    	if(event.getSource() == boxRotate) {
		    		RotateTransition rt = new RotateTransition(Duration.millis(5000), box);
		    	    rt.setByAngle(180);//The amount we rotate by
		    	    rt.setCycleCount(1);//Tells the rotation method how many times it should work
		    	    rt.setAutoReverse(true);//Goes in reverse after completing. 
		    	    rt.play();
		    	}
		    	
		        if(event.getSource() == boxScale) {
		    	    
		    	    //Scale transition
		    	     ScaleTransition st = new ScaleTransition(Duration.millis(2000), box);
		    	     st.setByX(1.5f);
		    	     st.setByY(1.5f);
		    	     st.setCycleCount(2);
		    	     st.setAutoReverse(true);
		    	     st.play();
		        }
		        
		        if(event.getSource() == boxSequence) {
		   	     //Sequential 
		   	     final Duration SEC_2 = Duration.millis(2000);
		   	     final Duration SEC_3 = Duration.millis(3000);
		   	     PauseTransition pt = new PauseTransition(Duration.millis(1000));
		   	    
		   	     RotateTransition rt2 = new RotateTransition(SEC_3);
		   	     rt2.setByAngle(180f);
		   	     rt2.setCycleCount(1);
		   	     rt2.setAutoReverse(true);
		   	     ScaleTransition st2 = new ScaleTransition(SEC_2);
		   	     st2.setByX(1.5f);
		   	     st2.setByY(1.5f);
		   	     st2.setCycleCount(2);
		   	     st2.setAutoReverse(true);
		   	     SequentialTransition seqT = new SequentialTransition (box, rt2, st2);
		   	     seqT.play();
		        	
		        }
		    }
		};
		boxScale.setOnAction(boxHandler);
		boxRotate.setOnAction(boxHandler);
		boxSequence.setOnAction(boxHandler);
		
		
		
		//Add event handling 
		EventHandler<ActionEvent> cylinderHandler = new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		    	if(event.getSource() == cylinderRotate) {
		    		RotateTransition rt = new RotateTransition(Duration.millis(5000), cylinder);
		    	    rt.setByAngle(180);//The amount we rotate by
		    	    rt.setCycleCount(1);//Tells the rotation method how many times it should work
		    	    rt.setAutoReverse(true);//Goes in reverse after completing. 
		    	    rt.play();
		    	}
		    	
		        if(event.getSource() == cylinderScale) {
		    	    
		    	    //Scale transition
		    	     ScaleTransition st = new ScaleTransition(Duration.millis(2000), cylinder);
		    	     st.setByX(1.5f);
		    	     st.setByY(1.5f);
		    	     st.setCycleCount(2);
		    	     st.setAutoReverse(true);
		    	     st.play();
		        }
		        
		        if(event.getSource() == cylinderSequence) {
		   	     //Sequential 
		   	     final Duration SEC_2 = Duration.millis(2000);
		   	     final Duration SEC_3 = Duration.millis(3000);
		   	     PauseTransition pt = new PauseTransition(Duration.millis(1000));
		   	    
		   	     RotateTransition rt2 = new RotateTransition(SEC_3);
		   	     rt2.setByAngle(180f);
		   	     rt2.setCycleCount(1);
		   	     rt2.setAutoReverse(true);
		   	     ScaleTransition st2 = new ScaleTransition(SEC_2);
		   	     st2.setByX(1.5f);
		   	     st2.setByY(1.5f);
		   	     st2.setCycleCount(2);
		   	     st2.setAutoReverse(true);
		   	     SequentialTransition seqT = new SequentialTransition (cylinder, rt2, st2);
		   	     seqT.play();
		        	
		        }
		    }
		};
		cylinderScale.setOnAction(cylinderHandler);
		cylinderRotate.setOnAction(cylinderHandler);
		cylinderSequence.setOnAction(cylinderHandler);
		
		
		
		
		EventHandler<ActionEvent> polygonHandler = new EventHandler<ActionEvent>() {
		    @Override
		    public void handle(ActionEvent event) {
		    	if(event.getSource() == polygonRotate) {
		    		RotateTransition rt = new RotateTransition(Duration.millis(5000), polygon);
		    	    rt.setByAngle(180);//The amount we rotate by
		    	    rt.setCycleCount(1);//Tells the rotation method how many times it should work
		    	    rt.setAutoReverse(true);//Goes in reverse after completing. 
		    	    rt.play();
		    	}
		    	
		        if(event.getSource() == polygonScale) {
		    	    
		    	    //Scale transition
		    	     ScaleTransition st = new ScaleTransition(Duration.millis(2000), polygon);
		    	     st.setByX(1.5f);
		    	     st.setByY(1.5f);
		    	     st.setCycleCount(2);
		    	     st.setAutoReverse(true);
		    	     st.play();
		        }
		        
		        if(event.getSource() == polygonSequence) {
		   	     //Sequential 
		   	     final Duration SEC_2 = Duration.millis(2000);
		   	     final Duration SEC_3 = Duration.millis(3000);
		   	     PauseTransition pt = new PauseTransition(Duration.millis(1000));
		   	    
		   	     RotateTransition rt2 = new RotateTransition(SEC_3);
		   	     rt2.setByAngle(180f);
		   	     rt2.setCycleCount(1);
		   	     rt2.setAutoReverse(true);
		   	     ScaleTransition st2 = new ScaleTransition(SEC_2);
		   	     st2.setByX(1.5f);
		   	     st2.setByY(1.5f);
		   	     st2.setCycleCount(2);
		   	     st2.setAutoReverse(true);
		   	     FadeTransition ft = new FadeTransition(Duration.millis(2000),polygon);
		   	     ft.setFromValue(1.0);
		   	     ft.setToValue(0.1);
		   	     ft.setCycleCount(2);
		   	     ft.setAutoReverse(true);
		   	     ft.play();
		   	     SequentialTransition seqT = new SequentialTransition (polygon, rt2, st2,ft);
		   	     seqT.play();
		        	
		        }
		        
		        if(event.getSource() == polygonTransition) {
		    	    
		   	     //Fade transition for 2d shapes 
		   	     FadeTransition ft = new FadeTransition(Duration.millis(2000),polygon);
		   	     ft.setFromValue(1.0);
		   	     ft.setToValue(0.1);
		   	     ft.setCycleCount(2);
		   	     ft.setAutoReverse(true);
		   	     ft.play();
		   	     
		        }
		    }
		};
		polygonScale.setOnAction(polygonHandler);
		polygonRotate.setOnAction(polygonHandler);
		polygonSequence.setOnAction(polygonHandler);
		polygonTransition.setOnAction(polygonHandler);
		
		//We need to merge menus and gridlayout
		
		master.getChildren().setAll(menuBar,layout);
		Scene scene = new Scene(master);
		
		//We need to set the scene for everything to work
		stage.setScene(scene);
		
		
		
		stage.setX(350);
		stage.setY(200);
		stage.setMinHeight(200);
		stage.setMinWidth(350);
		stage.setTitle("Animations");
		stage.show();
		
	}
	
	
	
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
