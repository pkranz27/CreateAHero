MERGE INTO `item` ( item_id, name, description, level, might, intellegence, image) VALUES
 (1,'Starter Sword','A Rookie sword with which to start your journey! Level:1 Stats: +1 might',1,2,0,'https://media.sketchfab.com/models/9bf38e16924042da9b05a6ccda0a1e5e/thumbnails/142dd14d38a34895a17a411d2debc030/eddf8cf0bddb468e88739e74cb6cea6f.jpeg'),
 (2,'Potion','Someting to calm your nerves and invigorate the soul. Removes Status Debuffs', 1,1,0,'https://thumbs.dreamstime.com/b/health-potion-isolated-white-background-d-illustration-197860761.jpg'),
 (3,'Poison','This liquid will hinder your stats, and not in the fun way like Vodka. Inflict -1 int, -1 might',1,1,1,'https://cdn.inprnt.com/thumbs/36/94/3694147ff6fae2b9ae3185e7d2902c93.jpg?response-cache-control=max-age=2628000');
MERGE INTO `race` (race_id, name, description, might, intellegence, image ) VALUES
(1,'Drow', 'Also known as dark elves, deep elves, night elves, raised with cruel hearts', 2,2, 'https://upload.wikimedia.org/wikipedia/en/c/cf/Drizzt.png'),
(2,'Dwarf','Small hardy folk',3,2,'https://i.pinimg.com/736x/10/30/6d/10306d2c61cfd3c2386f3170ecbe3d2e.jpg'),
(3,'Human','Base nuteral jack of all trades',2,2,'https://www.dndbeyond.com/avatars/thumbnails/6/258/420/618/636271801914013762.png'),
(4,'Elf','From time to time the elves organized strong nations, though with far less frequency than eladrin, in some cases adopting even a nomadic lifestyle.',3,1,'https://sagegamers.com/ezoimgfmt/149658804.v2.pressablecdn.com/wp-content/uploads/2021/04/lorracyn__the_half_elf_ranger_by_ohheyitskaylak_deesm7m-fullview.jpg?ezimgfmt=ng%3Awebp%2Fngcb1%2Frs%3Adevice%2Frscb1-2');
MERGE INTO `profession`(profession_id, name, description, image, might, intellegence) VALUES
(1,'Archer','A ranged class that deals physical ranged DPS','https://koboldpress.com/wp-content/uploads/2018/10/alchemist-archer-elf.jpg',2,2),
(2,'Fighter','A Might based class that is meele centric','https://www.dndbeyond.com/avatars/thumbnails/6/359/420/618/636272697874197438.png',3,1),
(3,'Mage','Study and practice of magic.','https://www.nicepng.com/png/detail/243-2438847_class-creation-knight-mage-d-d-5e.png',1,3);