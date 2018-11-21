def pool = ['a'..'z','A'..'Z',0..9,'_','$','#','%','&'].flatten()

Random rand = new Random(System.currentTimeMillis())

def passChars = (0..32).collect { pool[rand.nextInt(pool.size())] }
def password = passChars.join("")

return password