import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Athlete implements Comparable<Athlete> {
 private String name;
 private String sport;

 public Athlete(String name, String sport) {
  this.name = name;
  this.sport = sport;
 }

 public String getName() {
  return name;
 }

 public String getSport() {
  return sport;
 }

 @Override
 public int compareTo(Athlete other) {
  return this.name.compareTo(other.name);
 }

 @Override
 public String toString() {
  return name + " (" + sport + ")";
 }
}

class AthleteManager {
 private List<Athlete> athletes = new ArrayList<>();

 public void addAthlete(Athlete athlete) {
  athletes.add(athlete);
 }

 public void displayAthletes() {
  Collections.sort(athletes);
  for (Athlete athlete : athletes) {
   System.out.println(athlete);
  }
 }
}

public class Individuno4 {
 public static void main(String[] args) {
  AthleteManager manager = new AthleteManager();

  // Contoh data atlet
  manager.addAthlete(new Athlete("Budi", "Badminton"));
  manager.addAthlete(new Athlete("Andi", "Tenis Meja"));
  manager.addAthlete(new Athlete("Dewi", "Basket"));
  manager.addAthlete(new Athlete("Eko", "Bola Voly"));
  manager.addAthlete(new Athlete("Citra", "Badminton"));

  // Menampilkan atlet
  manager.displayAthletes();
 }
}
