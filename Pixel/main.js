const pixelArray = []
const pixelWidth = 10
const pixelHeigth = 10

function start() {
    createPixelStructure()
    createSource()
    renderPixel()

    setInterval(calculatePropagation, 1000)
}

function createPixelStructure(){ //Cria a estrutura do array, que seria a lista que será transformada em tabela
    const numberPixel = pixelWidth * pixelHeigth
    
    for (let i = 0; i < numberPixel; i++){
        pixelArray[i] = 0
    }
}

function calculatePropagation(){
    for (let column = 0; column < pixelWidth; column++){
        for (let row = 0; row < pixelHeigth; row++){
            const pixelIndex = column + (pixelWidth * row)

            //console.log(pixelIndex)
            updateIntensity(pixelIndex)
        }
    }

    renderPixel()
}

function updateIntensity(currentPixelIndex) {
    const belowPixelIndex = currentPixelIndex + pixelWidth

    if (belowPixelIndex >= pixelWidth * pixelHeigth) {
        return
    }

    const decay = 1
    const belowPixelIntesity = pixelArray[belowPixelIndex]
    const newIntensity = belowPixelIntesity - decay >= 0 ? belowPixelIntesity - decay : 0

    pixelArray[currentPixelIndex] = newIntensity
}

function renderPixel(){ //Renderiza e transforma o array em tabela que será transformada em pixels
    const debug = true
    let html = '<table celpadding=0 celspacing=0>'
    
    for (let row = 0; row < pixelHeigth; row++){
        html +='<tr>'

        for (let column = 0; column < pixelWidth; column++){
            const pixelIndex = column + (pixelWidth * row)
            const pixelIntensity = pixelArray[pixelIndex]

            if (debug === true) {
                html += '<td>'
                html += `<div class="pixel-index">${pixelIndex}</div>`
                html += pixelIntensity
                html += '</td>'
            }else{
                const color = palette[intensity]
                const colorString = `${color.r},${color.g},${color.b}`
                html += `<td style="background-color: rgb(${colorString})">`
                html += '</td>'
            }
        }
        html +='</tr>'
    }
    html += '</table>'
    document.querySelector("#canvas").innerHTML = html
}

function createSource(){ //Adiciona que a base é o ponto inicial, sendo o ponto mais forte
    for (let column = 0; column <= pixelWidth; column++){
        const overflowPixel = pixelWidth * pixelHeigth
        const pixelIndex = (overflowPixel - pixelWidth) + column

        pixelArray[pixelIndex] = 36
    }
}
start()