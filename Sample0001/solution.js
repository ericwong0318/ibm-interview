buffer = ''

process.stdin.on("data", data => {
    buffer += data.toString()
    if (buffer.split('\n').filter(e => !!e).length !== 2)
        return 

    lines = buffer.split('\n')
    numbers = lines[1].split(' ').map(numStr => parseInt(numStr))
    numSum = 0

    for (i = 0; i < numbers.length; i++) {
        numSum += numbers[i]
    }
    process.stdout.write(numSum + "\n")
    process.exit()
})