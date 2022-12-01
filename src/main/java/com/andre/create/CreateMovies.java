package com.andre.create;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateMovies {
  private String[] arrayData = {"{\"year\":2000,\"movies\":[{\"title\":\"The Contender\",\"year\":2000,\"response\":6.4,\"genres\":\"Drama\",\"cast\":[{\"fullName\":\"Joan Allen\"},{\"fullName\":\"Jeff Bridges\"},{\"fullName\":\"Gary Oldman\"},{\"fullName\":\"Christian Slater\"},{\"fullName\":\"Sam Elliott\"},{\"fullName\":\"Kathryn Morris\"}]},{\"title\":\"Coyote Ugly\",\"year\":2000,\"response\":6.3,\"genres\":\"Comedy\",\"cast\":[{\"fullName\":\"Piper Perabo\"},{\"fullName\":\"Adam Garcia\"},{\"fullName\":\"Tyra Banks\"}]},{\"title\":\"The Crew\",\"year\":2000,\"response\":3.2,\"genres\":\"Comedy\",\"cast\":[{\"fullName\":\"Richard Dreyfuss\"},{\"fullName\":\"Burt Reynolds\"},{\"fullName\":\"Dan Hedaya\"}]},{\"title\":\"The Crossing\",\"year\":2000,\"response\":8.8,\"genres\":\"Historical\",\"cast\":[{\"fullName\":\"Jeff Daniels\"},{\"fullName\":\"Roger Rees\"},{\"fullName\":\"Sebastian Roché\"},{\"fullName\":\"Steven McCarthy\"}]},{\"title\":\"Digimon\",\"year\":2000,\"response\":3.7,\"genres\":\"Adventure\",\"cast\":[{\"fullName\":\"Lara Jill Miller\"},{\"fullName\":\"Joshua Seth\"},{\"fullName\":\"Bob Glouberman\"}]},{\"title\":\"Dinosaur\",\"year\":2000,\"response\":1.2,\"genres\":\"Animated\",\"cast\":[{\"fullName\":\"D.B. Sweeney\"},{\"fullName\":\"Alfre Woodard\"},{\"fullName\":\"Ossie Davis\"}]},{\"title\":\"Down to You\",\"year\":2000,\"response\":9.9,\"genres\":\"Comedy\",\"cast\":[{\"fullName\":\"Freddie Prinze\"},{\"fullName\":\"Julia Stiles\"}]},{\"title\":\"Dr. T & the Women\",\"year\":2000,\"response\":3.4,\"genres\":\"Romance\",\"cast\":[{\"fullName\":\"Alfre Woodard\"},{\"fullName\":\"Ossie Davis\"},{\"fullName\":\"Alfre Woodard\"},{\"fullName\":\"Ossie Davis\"}]},{\"title\":\"Dracula 2000\",\"year\":2000,\"response\":6.6,\"genres\":\"Horror\",\"cast\":[{\"fullName\":\"Gerard Butler\"},{\"fullName\":\"Christopher Plummer\"}]},{\"title\":\"Drowning Mona\",\"year\":2000,\"response\":8.8,\"genres\":\"Comedy\",\"cast\":[{\"fullName\":\"Bette Midler\"},{\"fullName\":\"Jamie Lee Curtis\"},{\"fullName\":\"Danny DeVito\"},{\"fullName\":\"Neve Campbell\"}]}]}",
  "{\"year\":2001,\"movies\":[{\"title\":\"3 A.M.\",\"year\":2001,\"response\":8.8,\"cast\":[{\"fullName\":\"Danny Glover\"},{\"fullName\":\"Pam Grier\"},{\"fullName\":\"Sarita Choudhury\"}],\"genres\":\"Crime\"},{\"title\":\"3000 Miles to Graceland\",\"year\":2001,\"response\":3.8,\"cast\":[{\"fullName\":\"Kurt Russell\"},{\"fullName\":\"Kevin Costner\"},{\"fullName\":\"Christian Slater\"},{\"fullName\":\"Courteney Cox\"}],\"genres\":\"Action\"},{\"title\":\"A.I. Artificial Intelligence\",\"year\":2001,\"response\":8.6,\"cast\":[{\"fullName\":\"Sam Robards\"},{\"fullName\":\"Frances O'Connor\"},{\"fullName\":\"William Hurt\"},{\"fullName\":\"Haley Joel Osment\"},{\"fullName\":\"Jude Law\"}],\"genres\":\"Science Fiction\"},{\"title\":\"The Affair of the Necklace\",\"year\":2001,\"response\":5.6,\"cast\":[{\"fullName\":\"Hilary Swank\"},{\"fullName\":\"Jonathan Pryce\"},{\"fullName\":\"Adrien Brody\"}],\"genres\":\"Drama\"},{\"title\":\"Ali\",\"year\":2001,\"response\":3.9,\"cast\":[{\"fullName\":\"Will Smith\"},{\"fullName\":\"Jamie Foxx\"},{\"fullName\":\"Mario Van Peebles\"}],\"genres\":\"Drama\"},{\"title\":\"All Over the Guy\",\"year\":2001,\"response\":7.7,\"cast\":[{\"fullName\":\"Adam Goldberg\"},{\"fullName\":\"Dan Bucatinsky\"},{\"fullName\":\"Sasha Alexander\"}],\"genres\":\"Comedy\"},{\"title\":\"Along Came a Spider\",\"year\":2001,\"response\":3.4,\"cast\":[{\"fullName\":\"Morgan Freeman\"},{\"fullName\":\"Monica Potter\"}],\"genres\":\"Crime\"},{\"title\":\"The Amati Girls\",\"year\":2001,\"response\":9.9,\"cast\":[{\"fullName\":\"Mercedes Ruehl\"},{\"fullName\":\"Cloris Leachman\"},{\"fullName\":\"Sean Young\"}],\"genres\":\"Drama\"},{\"title\":\"America's Sweethearts\",\"year\":2001,\"response\":1.3,\"cast\":[{\"fullName\":\"Catherine Zeta-Jones\"},{\"fullName\":\"Billy Crystal\"},{\"fullName\":\"Julia Roberts\"},{\"fullName\":\"John Cusack\"}],\"genres\":\"Comedy\"},{\"title\":\"The American Astronaut\",\"year\":2001,\"response\":2.2,\"cast\":[{\"fullName\":\"Rocco Sisto\"},{\"fullName\":\"Cory McAbee\"}],\"genres\":\"Musical\"},{\"title\":\"American Outlaws\",\"year\":2001,\"response\":6.7,\"cast\":[{\"fullName\":\"Ali Larter\"}],\"genres\":\"Western\"},{\"title\":\"American Pie 2\",\"year\":2001,\"response\":3.4,\"cast\":[{\"fullName\":\"Jason Biggs\"},{\"fullName\":\"Shannon Elizabeth\"},{\"fullName\":\"Chris Klein\"},{\"fullName\":\"Seann William Scott\"}],\"genres\":\"Crime\"}]}",
  "{\"year\":2002,\"movies\":[{\"title\":\"25th Hour\",\"year\":2002,\"response\":8.8,\"cast\":[{\"fullName\":\"Edward Norton\"},{\"fullName\":\"Philip Seymour Hoffman\"},{\"fullName\":\"Barry Pepper\"}],\"genres\":\"Drama\"},{\"title\":\"40 Days and 40 Nights\",\"year\":2002,\"response\":3.8,\"cast\":[{\"fullName\":\"Josh Hartnett\"},{\"fullName\":\"Shannyn Sossamon\"}],\"genres\":\"Comedy\"},{\"title\":\"8 Mile\",\"year\":2002,\"response\":7.5,\"cast\":[{\"fullName\":\"Eminem\"},{\"fullName\":\"Kim Basinger\"},{\"fullName\":\"Brittany Murphy\"},{\"fullName\":\"Mekhi Phifer\"},{\"fullName\":\"Eugene Byrd\"}],\"genres\":\"Drama\"},{\"title\":\"Abandon\",\"year\":2002,\"response\":6.8,\"cast\":[{\"fullName\":\"Katie Holmes\"},{\"fullName\":\"Benjamin Bratt\"},{\"fullName\":\"Zooey Deschanel\"}],\"genres\":\"Drama\"},{\"title\":\"About a Boy\",\"year\":2002,\"response\":9.9,\"cast\":[{\"fullName\":\"Hugh Grant\"},{\"fullName\":\"Nicholas Hoult\"},{\"fullName\":\"Toni Collette\"}],\"genres\":\"Comedy\"},{\"title\":\"About Schmidt\",\"year\":2002,\"response\":7.4,\"cast\":[{\"fullName\":\"Jack Nicholson\"},{\"fullName\":\"Kathy Bates\"}],\"genres\":\"Comedy\"}]}",
  "{\"year\":2003,\"movies\":[{\"title\":\"11:14\",\"year\":2003,\"response\":7.4,\"cast\":[{\"fullName\":\"Henry Thomas\"},{\"fullName\":\"Blake Heron\"},{\"fullName\":\"Barbara Hershey\"}],\"genres\":\"Crime\"},{\"title\":\"101 Dalmatians II: Patch's London Adventure\",\"year\":2003,\"response\":4.5,\"cast\":[{\"fullName\":\"Barry Bostwick\"},{\"fullName\":\"Jason Alexander\"},{\"fullName\":\"Martin Short\"}],\"genres\":\"Animated\"},{\"title\":\"2 Fast 2 Furious\",\"year\":2003,\"response\":9.8,\"cast\":[{\"fullName\":\"Paul Walker\"},{\"fullName\":\"Tyrese Gibson\"},{\"fullName\":\"Eva Mendes\"},{\"fullName\":\"Ludacris\"}],\"genres\":\"Action\"},{\"title\":\"21 Grams\",\"year\":2003,\"response\":6.9,\"cast\":[{\"fullName\":\"Sean Penn\"},{\"fullName\":\"Naomi Watts\"},{\"fullName\":\"Benicio del Toro\"}],\"genres\":\"Crime\"},{\"title\":\"44 Minutes: The North Hollywood Shoot-Out\",\"year\":2003,\"response\":8.9,\"cast\":[{\"fullName\":\"Michael Madsen\"},{\"fullName\":\"Ron Livingston\"}],\"genres\":\"Action\"},{\"title\":\"Abby Singer\",\"year\":2003,\"response\":8.7,\"cast\":[{\"fullName\":\"Clint J. Palmer\"},{\"fullName\":\"Ryan Williams\"},{\"fullName\":\"Wendy Buss\"}],\"genres\":\"Comedy\"}]}",
  "{\"year\":2004,\"movies\":[{\"title\":\"13 Going on 30\",\"year\":2004,\"response\":6.4,\"cast\":[{\"fullName\":\"Jennifer Garner\"},{\"fullName\":\"Mark Ruffalo\"}],\"genres\":\"Comedy\"},{\"title\":\"50 First Dates\",\"year\":2004,\"response\":7.4,\"cast\":[{\"fullName\":\"Adam Sandler\"},{\"fullName\":\"Drew Barrymore\"}],\"genres\":\"Comedy\"},{\"title\":\"After the Sunset\",\"year\":2004,\"response\":3.6,\"cast\":[{\"fullName\":\"Pierce Brosnan\"},{\"fullName\":\"Salma Hayek\"},{\"fullName\":\"Woody Harrelson\"},{\"fullName\":\"Don Cheadle\"}],\"genres\":\"Crime\"},{\"title\":\"Against the Ropes\",\"year\":2004,\"response\":8.6,\"cast\":[{\"fullName\":\"Meg Ryan\"},{\"fullName\":\"Omar Epps\"}],\"genres\":\"Drama\"},{\"title\":\"Agent Cody Banks 2: Destination London\",\"year\":2004,\"response\":4.6,\"cast\":[{\"fullName\":\"Frankie Muniz\"},{\"fullName\":\"Anthony Anderson\"}],\"genres\":\"Family\"},{\"title\":\"The Alamo\",\"year\":2004,\"response\":9.4,\"cast\":[{\"fullName\":\"Dennis Quaid\"},{\"fullName\":\"Billy Bob Thornton\"},{\"fullName\":\"Jason Patric\"},{\"fullName\":\"Patrick Wilson\"}],\"genres\":\"Western\"}]}",
  "{\"year\":2005,\"movies\":[{\"title\":\"51 Birch Street\",\"year\":2005,\"response\":8.5,\"cast\":[{\"fullName\":\"love\"},{\"fullName\":\"marriage\"},{\"fullName\":\"fidelity and a\"}],\"genres\":\"Documentary\"},{\"title\":\"The Adventures of Sharkboy and Lavagirl in 3-D\",\"year\":2005,\"response\":3.2,\"cast\":[{\"fullName\":\"Taylor Lautner\"},{\"fullName\":\"Taylor Dooley\"},{\"fullName\":\"Cayden Boyd\"},{\"fullName\":\"George Lopez\"}],\"genres\":\"Family\"},{\"title\":\"Æon Flux\",\"year\":2005,\"response\":8.9,\"cast\":[{\"fullName\":\"Charlize Theron\"}],\"genres\":\"Science Fiction\"},{\"title\":\"Aliens of the Deep\",\"year\":2005,\"response\":4.6,\"cast\":[{\"fullName\":\"Mid-Ocean Ridge\"}],\"genres\":\"Documentary\"},{\"title\":\"Alone in the Dark\",\"year\":2005,\"response\":7.7,\"cast\":[{\"fullName\":\"Christian Slater\"},{\"fullName\":\"Tara Reid\"},{\"fullName\":\"Stephen Dorff\"}],\"genres\":\"Comedy\"}]}",
  "{\"year\":2006,\"movies\":[{\"title\":\"45\",\"year\":2006,\"response\":4.4,\"cast\":[{\"fullName\":\"Milla Jovovich\"},{\"fullName\":\"Angus Macfadyen\"},{\"fullName\":\"Aisha Tyler\"},{\"fullName\":\"Stephen Dorff\"}],\"genres\":\"Crime\"},{\"title\":\"10 Items or Less\",\"year\":2006,\"response\":8.9,\"cast\":[{\"fullName\":\"Morgan Freeman\"},{\"fullName\":\"Paz Vega\"}],\"genres\":\"Comedy\"},{\"title\":\"10th & Wolf\",\"year\":2006,\"response\":9.3,\"cast\":[{\"fullName\":\"James Marsden\"},{\"fullName\":\"Giovanni Ribisi\"}],\"genres\":\"Crime\"},{\"title\":\"16 Blocks\",\"year\":2006,\"response\":4.7,\"cast\":[{\"fullName\":\"Bruce Willis\"},{\"fullName\":\"Mos Def\"}],\"genres\":\"Crime\"}]}",
  "{\"year\":2007,\"movies\":[{\"title\":\"10 MPH\",\"year\":2007,\"response\":7.7,\"cast\":[{\"fullName\":\"Josh Caldwell's\"},{\"fullName\":\"Segway HT\"}],\"genres\":\"Documentary\"},{\"title\":\"The 11th Hour\",\"year\":2007,\"response\":8.9,\"cast\":[{\"fullName\":\"The state of the\"},{\"fullName\":\"natural environment\"},{\"fullName\":\"Leonardo DiCaprio\"}],\"genres\":\"Documentary\"},{\"title\":\"1408\",\"year\":2007,\"response\":6.7,\"cast\":[{\"fullName\":\"John Cusack\"},{\"fullName\":\"Samuel L. Jackson\"}],\"genres\":\"Horror\"},{\"title\":\"3:10 to Yuma\",\"year\":2007,\"response\":5.8,\"cast\":[{\"fullName\":\"Russell Crowe\"},{\"fullName\":\"Christian Bale\"}],\"genres\":\"Western\"},{\"title\":\"30 Days of Night\",\"year\":2007,\"response\":5.6,\"cast\":[{\"fullName\":\"Josh Hartnett\"},{\"fullName\":\"Ben Foster\"},{\"fullName\":\"Melissa George\"}],\"genres\":\"Horror\"}]}",
  "{\"year\":2008,\"movies\":[{\"title\":\"10,000 BC\",\"year\":2008,\"response\":6.4,\"cast\":[{\"fullName\":\"Steven Strait\"},{\"fullName\":\"Camilla Belle\"},{\"fullName\":\"Cliff Curtis\"}],\"genres\":\"Adventure\"},{\"title\":\"21\",\"year\":2008,\"response\":6.7,\"cast\":[{\"fullName\":\"Jim Sturgess\"},{\"fullName\":\"Kevin Spacey\"},{\"fullName\":\"Kate Bosworth\"},{\"fullName\":\"Laurence Fishburne\"}],\"genres\":\"Drama\"},{\"title\":\"27 Dresses\",\"year\":2008,\"response\":5.5,\"cast\":[{\"fullName\":\"Katherine Heigl\"},{\"fullName\":\"James Marsden\"},{\"fullName\":\"Malin Åkerman\"}],\"genres\":\"Romance\"},{\"title\":\"88 Minutes\",\"year\":2008,\"response\":8.4,\"cast\":[{\"fullName\":\"Al Pacino\"},{\"fullName\":\"Alicia Witt\"},{\"fullName\":\"Leelee Sobieski\"},{\"fullName\":\"Amy Brenneman\"},{\"fullName\":\"Deborah Kara Unger\"}],\"genres\":\"Thriller\"},{\"title\":\"The Accidental Husband\",\"year\":2008,\"response\":8.5,\"cast\":[{\"fullName\":\"Uma Thurman\"},{\"fullName\":\"Jeffrey Dean Morgan\"},{\"fullName\":\"Colin Firth\"}],\"genres\":\"Romance\"}]}",
  "{\"year\":2009,\"movies\":[{\"title\":\"12 Rounds\",\"year\":2009,\"response\":8.7,\"cast\":[{\"fullName\":\"John Cena\"},{\"fullName\":\"Ashley Scott\"},{\"fullName\":\"Steve Harris\"},{\"fullName\":\"Aidan Gillen\"}],\"genres\":\"Action\"},{\"title\":\"17 Again\",\"year\":2009,\"response\":7.5,\"cast\":[{\"fullName\":\"Zac Efron\"},{\"fullName\":\"Leslie Mann\"},{\"fullName\":\"Thomas Lennon\"},{\"fullName\":\"Matthew Perry\"},{\"fullName\":\"Melora Hardin\"},{\"fullName\":\"Michelle Trachtenberg\"},{\"fullName\":\"Sterling Knight\"}],\"genres\":\"Comedy\"},{\"title\":\"2012\",\"year\":2009,\"response\":9.8,\"cast\":[{\"fullName\":\"John Cusack\"},{\"fullName\":\"Amanda Peet\"},{\"fullName\":\"Danny Glover\"},{\"fullName\":\"Thandie Newton\"},{\"fullName\":\"Oliver Platt\"},{\"fullName\":\"Chiwetel Ejiofor\"},{\"fullName\":\"Woody Harrelson\"}],\"genres\":\"Disaster\"},{\"title\":\"9\",\"year\":2009,\"response\":6.5,\"cast\":[{\"fullName\":\"Elijah Wood\"},{\"fullName\":\"John C. Reilly\"},{\"fullName\":\"Jennifer Connelly\"},{\"fullName\":\"Christopher Plummer\"}],\"genres\":\"Animated\"}]}",
  "{\"year\":2010,\"movies\":[{\"title\":\"The A-Team\",\"year\":2010,\"response\":8.9,\"cast\":[{\"fullName\":\"Liam Neeson\"},{\"fullName\":\"Bradley Cooper\"}],\"genres\":\"Action\"},{\"title\":\"A Little Help\",\"year\":2010,\"response\":7.6,\"cast\":[{\"fullName\":\"Jenna Fischer\"},{\"fullName\":\"Chris O'Donnell\"},{\"fullName\":\"Rob Benedict\"}],\"genres\":\"Comedy\"},{\"title\":\"Adventures of Power\",\"year\":2010,\"response\":6.9,\"cast\":[{\"fullName\":\"Ari Gold\"},{\"fullName\":\"Michael McKean\"},{\"fullName\":\"Jane Lynch\"}],\"genres\":\"Comedy\"},{\"title\":\"Alice in Wonderland\",\"year\":2010,\"response\":5.6,\"cast\":[{\"fullName\":\"Johnny Depp\"},{\"fullName\":\"Anne Hathaway\"},{\"fullName\":\"Helena Bonham Carter\"}],\"genres\":\"Family\"},{\"title\":\"All Good Things\",\"year\":2010,\"response\":5.4,\"cast\":[{\"fullName\":\"Ryan Gosling\"},{\"fullName\":\"Kirsten Dunst\"},{\"fullName\":\"Frank Langella\"}],\"genres\":\"Mystery\"}]}",
  "{\"year\":2011,\"movies\":[{\"title\":\"30 Minutes or Less\",\"year\":2011,\"response\":7.7,\"cast\":[{\"fullName\":\"Jesse Eisenberg\"},{\"fullName\":\"Danny McBride\"},{\"fullName\":\"Aziz Ansari\"}],\"genres\":\"Adventure\"},{\"title\":\"35 and Ticking\",\"year\":2011,\"response\":6.8,\"cast\":[{\"fullName\":\"Tamala Jones\"},{\"fullName\":\"Nicole Ari Parker\"},{\"fullName\":\"Keith Robinson\"},{\"fullName\":\"Darius McCrary\"}],\"genres\":\"Romance\"},{\"title\":\"50/50\",\"year\":2011,\"response\":8.6,\"cast\":[{\"fullName\":\"Joseph Gordon-Levitt\"},{\"fullName\":\"Seth Rogen\"},{\"fullName\":\"Anna Kendrick\"},{\"fullName\":\"Bryce Dallas Howard\"},{\"fullName\":\"Anjelica Huston\"}],\"genres\":\"Comedy\"},{\"title\":\"Abduction\",\"year\":2011,\"response\":6.7,\"cast\":[{\"fullName\":\"Taylor Lautner\"},{\"fullName\":\"Lily Collins\"},{\"fullName\":\"Alfred Molina\"}],\"genres\":\"Action\"},{\"title\":\"The Adjustment Bureau\",\"year\":2011,\"response\":4.9,\"cast\":[{\"fullName\":\"Matt Damon\"},{\"fullName\":\"Emily Blunt\"},{\"fullName\":\"Anthony Mackie\"},{\"fullName\":\"Shoreh Aghdashloo\"}],\"genres\":\"Romance\"}]}",
  "{\"year\":2012,\"movies\":[{\"title\":\"2-Headed Shark Attack\",\"year\":2012,\"response\":6.7,\"cast\":[{\"fullName\":\"Carmen Electra\"},{\"fullName\":\"Charlie O'Connell\"},{\"fullName\":\"Brooke Hogan\"},{\"fullName\":\"Christina Bach\"},{\"fullName\":\"David Gallegos\"}],\"genres\":\"Horror\"},{\"title\":\"21 Jump Street\",\"year\":2012,\"response\":1.7,\"cast\":[{\"fullName\":\"Jonah Hill\"},{\"fullName\":\"Channing Tatum\"},{\"fullName\":\"Brie Larson\"},{\"fullName\":\"Ice Cube\"}],\"genres\":\"Comedy\"},{\"title\":\"28 Hotel Rooms\",\"year\":2012,\"response\":8.9,\"cast\":[{\"fullName\":\"Marin Ireland\"},{\"fullName\":\"Chris Messina\"},{\"fullName\":\"Robert Deamer\"}],\"genres\":\"Thriller\"},{\"title\":\"3,2,1... Frankie Go Boom\",\"year\":2012,\"response\":6.5,\"cast\":[{\"fullName\":\"Charlie Hunnam\"},{\"fullName\":\"Chris O'Dowd\"},{\"fullName\":\"Lizzy Caplan\"},{\"fullName\":\"Nora Dunn\"}],\"genres\":\"Comedy\"},{\"title\":\"40 Days and Nights\",\"year\":2012,\"response\":9.7,\"cast\":[{\"fullName\":\"Monica Keena\"},{\"fullName\":\"Christianna Carmine\"},{\"fullName\":\"Emily Sandifer\"},{\"fullName\":\"Alex Carter\"}],\"genres\":\"Horror\"}]}",
  "{\"year\":2013,\"movies\":[{\"title\":\"2 Guns\",\"year\":2013,\"response\":7.4,\"cast\":[{\"fullName\":\"Denzel Washington\"},{\"fullName\":\"Mark Wahlberg\"},{\"fullName\":\"Paula Patton\"}],\"genres\":\"Action\"},{\"title\":\"12 Rounds 2: Reloaded\",\"year\":2013,\"response\":8.9,\"cast\":[{\"fullName\":\"Randy Orton\"},{\"fullName\":\"Brian Markinson\"},{\"fullName\":\"Venus Terzo\"}],\"genres\":\"Action\"},{\"title\":\"12 Years a Slave\",\"year\":2013,\"response\":9.4,\"cast\":[{\"fullName\":\"Chiwetel Ejiofor\"},{\"fullName\":\"Michael Fassbender\"},{\"fullName\":\"Benedict Cumberbatch\"}],\"genres\":\"Drama\"},{\"title\":\"20 Feet from Stardom\",\"year\":2013,\"response\":8.3,\"cast\":[{\"fullName\":\"A look at the lives of background singers.\"}],\"genres\":\"Documentary\"},{\"title\":\"21 and Over\",\"year\":2013,\"response\":7.7,\"cast\":[{\"fullName\":\"Miles Teller\"},{\"fullName\":\"Skylar Astin\"},{\"fullName\":\"Justin Chon\"},{\"fullName\":\"Sarah Wright\"}],\"genres\":\"Comedy\"},{\"title\":\"3 Geezers!\",\"year\":2013,\"response\":9.6,\"cast\":[{\"fullName\":\"J.K. Simmons\"},{\"fullName\":\"Basil Hoffman\"},{\"fullName\":\"Tim Allen\"}],\"genres\":\"Comedy\"},{\"title\":\"30 Nights of Paranormal Activity with the Devil Inside the Girl with the Dragon Tattoo\",\"year\":2013,\"response\":2.2,\"cast\":[{\"fullName\":\"Kathryn Fiore\"},{\"fullName\":\"Ben Morrison\"},{\"fullName\":\"French Stewart\"}],\"genres\":\"Comedy\"}]}",
  "{\"year\":2014,\"movies\":[{\"title\":\"The Legend of Hercules\",\"year\":2014,\"response\":7.6,\"cast\":[{\"fullName\":\"Kellan Lutz\"},{\"fullName\":\"Gaia Weiss\"},{\"fullName\":\"Scott Adkins\"}],\"genres\":\"Fantasy\"},{\"title\":\"Raze\",\"year\":2014,\"response\":8.5,\"cast\":[{\"fullName\":\"Zoë Bell\"},{\"fullName\":\"Rachel Nichols\"},{\"fullName\":\"Tracie Thoms\"}],\"genres\":\"Thriller\"},{\"title\":\"Back in the Day\",\"year\":2014,\"response\":9.9,\"cast\":[{\"fullName\":\"Michael Rosenbaum\"},{\"fullName\":\"Morena Baccarin\"},{\"fullName\":\"Kristoffer Polaha\"},{\"fullName\":\"Isaiah Mustafa\"}],\"genres\":\"Comedy\"},{\"title\":\"Devil's Due\",\"year\":2014,\"response\":6.6,\"cast\":[{\"fullName\":\"Zach Gilford\"},{\"fullName\":\"Allison Miller\"},{\"fullName\":\"Sam Anderson\"},{\"fullName\":\"Aimee Carrero\"}],\"genres\":\"Horror\"},{\"title\":\"Jack Ryan: Shadow Recruit\",\"year\":2014,\"response\":9.4,\"cast\":[{\"fullName\":\"Chris Pine\"},{\"fullName\":\"Keira Knightley\"},{\"fullName\":\"Kevin Costner\"},{\"fullName\":\"Kenneth Branagh\"}],\"genres\":\"Thriller\"}]}",
  "{\"year\":2015,\"movies\":[{\"title\":\"The Woman in Black 2: Angel of Death\",\"year\":2015,\"response\":7.8,\"cast\":[{\"fullName\":\"Phoebe Fox\"},{\"fullName\":\"Jeremy Irvine\"},{\"fullName\":\"Helen McCrory\"}],\"genres\":\"Horror\"},{\"title\":\"Taken 3\",\"year\":2015,\"response\":4.9,\"cast\":[{\"fullName\":\"Liam Neeson\"},{\"fullName\":\"Forest Whitaker\"},{\"fullName\":\"Famke Janssen\"}],\"genres\":\"Action\"},{\"title\":\"Let's Kill Ward's Wife\",\"year\":2015,\"response\":7.3,\"cast\":[{\"fullName\":\"Scott Foley\"},{\"fullName\":\"Patrick Wilson\"},{\"fullName\":\"Donald Faison\"},{\"fullName\":\"James Carpinello\"}],\"genres\":\"Comedy\"},{\"title\":\"Match\",\"year\":2015,\"response\":8.8,\"cast\":[{\"fullName\":\"Patrick Stewart\"},{\"fullName\":\"Carla Gugino\"},{\"fullName\":\"Matthew Lillard\"},{\"fullName\":\"Rob Yang\"}],\"genres\":\"Drama\"},{\"title\":\"Blackhat\",\"year\":2015,\"response\":6.3,\"cast\":[{\"fullName\":\"Chris Hemsworth\"},{\"fullName\":\"Viola Davis\"},{\"fullName\":\"Manny Montana\"},{\"fullName\":\"Tang Wei\"}],\"genres\":\"Action\"},{\"title\":\"Little Accidents\",\"year\":2015,\"response\":2.9,\"cast\":[{\"fullName\":\"Elizabeth Banks\"},{\"fullName\":\"Boyd Holbrook\"},{\"fullName\":\"Chloë Sevigny\"},{\"fullName\":\"Josh Lucas\"}],\"genres\":\"Drama\"}]}",
  "{\"year\":2016,\"movies\":[{\"title\":\"The Forest\",\"year\":2016,\"response\":4.6,\"cast\":[{\"fullName\":\"Natalie Dormer\"},{\"fullName\":\"Taylor Kitsch\"}],\"genres\":\"Thriller\"},{\"title\":\"Anesthesia\",\"year\":2016,\"response\":8.6,\"cast\":[{\"fullName\":\"Sam Waterston\"},{\"fullName\":\"Tim Blake Nelson\"},{\"fullName\":\"Kristen Stewart\"}],\"genres\":\"Drama\"},{\"title\":\"Lamb\",\"year\":2016,\"response\":8.9,\"cast\":[{\"fullName\":\"Ross Partridge\"},{\"fullName\":\"Oona Laurence\"},{\"fullName\":\"Jess Weixler\"}],\"genres\":\"Drama\"},{\"title\":\"Ride Along 2\",\"year\":2016,\"response\":9.9,\"cast\":[{\"fullName\":\"Ice Cube\"},{\"fullName\":\"Kevin Hart\"}],\"genres\":\"Action\"},{\"title\":\"13 Hours: The Secret Soldiers of Benghazi\",\"year\":2016,\"response\":4.5,\"cast\":[{\"fullName\":\"James Badge Dale\"},{\"fullName\":\"John Krasinski\"},{\"fullName\":\"Max Martini\"}],\"genres\":\"Action\"},{\"title\":\"Norm of the North\",\"year\":2016,\"response\":5.6,\"cast\":[{\"fullName\":\"Rob Schneider\"},{\"fullName\":\"Heather Graham\"},{\"fullName\":\"Ken Jeong\"}],\"genres\":\"Animated\"},{\"title\":\"The Benefactor\",\"year\":2016,\"response\":7.5,\"cast\":[{\"fullName\":\"Richard Gere\"},{\"fullName\":\"Dakota Fanning\"},{\"fullName\":\"Theo James\"}],\"genres\":\"Drama\"},{\"title\":\"Dirty Grandpa\",\"year\":2016,\"response\":3.6,\"cast\":[{\"fullName\":\"Zac Efron\"},{\"fullName\":\"Robert De Niro\"}],\"genres\":\"Comedy\"},{\"title\":\"The 5th Wave\",\"year\":2016,\"response\":7.4,\"cast\":[{\"fullName\":\"Chloë Grace Moretz\"},{\"fullName\":\"Liev Schreiber\"}],\"genres\":\"Science Fiction\"},{\"title\":\"The Boy\",\"year\":2016,\"response\":9.6,\"cast\":[{\"fullName\":\"Lauren Cohan\"},{\"fullName\":\"Rupert Evans\"}],\"genres\":\"Horror\"}]}",
  "{\"year\":2017,\"movies\":[{\"title\":\"Arsenal\",\"year\":2017,\"response\":7.9,\"cast\":[{\"fullName\":\"Adrian Grenier\"},{\"fullName\":\"Johnathon Schaech\"},{\"fullName\":\"Nicolas Cage\"}],\"genres\":\"Action\"},{\"title\":\"Between Us\",\"year\":2017,\"response\":5.5,\"cast\":[{\"fullName\":\"Olivia Thirlby\"},{\"fullName\":\"Ben Feldman\"},{\"fullName\":\"Adam Goldberg\"},{\"fullName\":\"Analeigh Tipton\"}],\"genres\":\"Comedy\"},{\"title\":\"Monster Trucks\",\"year\":2017,\"response\":8.8,\"cast\":[{\"fullName\":\"Lucas Till\"},{\"fullName\":\"Jane Levy\"},{\"fullName\":\"Amy Ryan\"},{\"fullName\":\"Holt McCallany\"}],\"genres\":\"Animated\"},{\"title\":\"The Bye Bye Man\",\"year\":2017,\"response\":9.6,\"cast\":[{\"fullName\":\"Douglas Smith\"},{\"fullName\":\"Doug Jones\"},{\"fullName\":\"Michael Trucco\"}],\"genres\":\"Horror\"}]}",
  "{\"year\":2018,\"movies\":[{\"title\":\"Insidious: The Last Key\",\"year\":2018,\"response\":6.9,\"cast\":[{\"fullName\":\"Lin Shaye\"},{\"fullName\":\"Angus Sampson\"},{\"fullName\":\"Leigh Whannell\"}],\"genres\":\"Horror\"},{\"title\":\"The Strange Ones\",\"year\":2018,\"response\":8.8,\"cast\":[{\"fullName\":\"Alex Pettyfer\"},{\"fullName\":\"James Freedson-Jackson\"},{\"fullName\":\"Emily Althaus\"}],\"genres\":\"Drama\"},{\"title\":\"Sweet Country\",\"year\":2018,\"response\":4.5,\"cast\":[{\"fullName\":\"Bryan Brown\"},{\"fullName\":\"Sam Neill\"}],\"genres\":\"Drama\"},{\"title\":\"The Commuter\",\"year\":2018,\"response\":9.9,\"cast\":[{\"fullName\":\"Liam Neeson\"},{\"fullName\":\"Vera Farmiga\"},{\"fullName\":\"Patrick Wilson\"}],\"genres\":\"Action\"},{\"title\":\"Proud Mary\",\"year\":2018,\"response\":6.6,\"cast\":[{\"fullName\":\"Taraji P.Henson\"},{\"fullName\":\"Billy Brown\"},{\"fullName\":\"Danny Glover\"},{\"fullName\":\"Neal McDonough\"}],\"genres\":\"Action\"},{\"title\":\"Acts of Violence\",\"year\":2018,\"response\":8.1,\"cast\":[{\"fullName\":\"Bruce Willis\"},{\"fullName\":\"Cole Hauser\"},{\"fullName\":\"Shawn Ashmore\"},{\"fullName\":\"Melissa Bolona\"},{\"fullName\":\"Mike Epps\"}],\"genres\":\"Action\"},{\"title\":\"Freak Show\",\"year\":2018,\"response\":6.4,\"cast\":[{\"fullName\":\"Alex Lawther\"},{\"fullName\":\"Abigail Breslin\"},{\"fullName\":\"Bette Midler\"}],\"genres\":\"Drama\"}]}"};
  public void createDirectories() {
    String pathMain = "Movies";
    File directoryMain = new File(pathMain);
    directoryMain.mkdir();

    for(int i = 2000; i<2019; i++){
      String path = "Movies\\"+ Integer.toString(i);
      File directory = new File(path);
      directory.mkdir();
      File file = new File(path + "\\movies.json");
      PrintWriter pw = null;
      try {
        pw = new PrintWriter(file);
      } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
      }
      pw.println(arrayData[i-2000]);
      pw.close();
    }
  }



}