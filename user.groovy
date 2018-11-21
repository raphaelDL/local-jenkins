def gods = ["aphrodite","apollo","ares","artemis","athena","demeter","dionysus",
            "hades","hephaestus","hera","hermes","hestia","poseidon","zeus"]

Random rand = new Random(System.currentTimeMillis())

def user = gods[rand.nextInt()%gods.size()]+"_"+System.currentTimeMillis()

return user